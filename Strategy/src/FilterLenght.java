public class FilterLenght implements WebSearchModel.Strategy {
    
    @Override
    public boolean interessado(String query) {
        return query.length() > 60;
    }

}
