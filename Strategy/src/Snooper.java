import javax.management.Query;

/**
 * Watches the search queries
 */
public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        WebSearchModel.QueryObserver observer = new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println(query);
            }
        };

        this.model.addQueryObserver( observer, new FilterLenght());
        
        this.model.addQueryObserver( observer, new FilterFriend());
    }
}
