package Creation.Factory;

public class FactoryMethod {
    public static void main(String[] args) {
        Coin coin1 =CoinFactory.getCoin(CoinType.GOLD);
        Coin coin2 =CoinFactory.getCoin(CoinType.SILVER);
        System.out.println(coin1.getDescription());
        System.out.println(coin2.getDescription());
    }
}
