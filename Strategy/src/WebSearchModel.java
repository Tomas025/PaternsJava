import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform "web search" (from a  file), notify the interested observers of each query.
 */
public class WebSearchModel {
    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();
    private final List<Strategy> filters = new ArrayList<>();
    
    public interface Strategy {
        boolean interessado(String query);
    }

    public interface QueryObserver {
        void onQuery(String query);
    }

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                for(Strategy filter : filters) {
                    if (filter.interessado(line)) {
                        notifyAllObservers(line);
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addQueryObserver(QueryObserver queryObserver, Strategy filter) {
        observers.add(queryObserver);
        filters.add(filter);
    }

    private void notifyAllObservers(String line) {
        for (QueryObserver obs : observers) {
            if (filters.get(0).interessado(line)) {
                obs.onQuery("So long.... " + line);
                break;
            } else if (filters.get(1).interessado(line)) {
                obs.onQuery("Oh Yes! " + line);
                break;
            }
        }
    }
}
