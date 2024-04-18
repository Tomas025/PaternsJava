public class FilterFriend implements WebSearchModel.Strategy {
 
    @Override
    public boolean interessado(String query) {
        return query.toLowerCase().contains("friend");
    }

}
