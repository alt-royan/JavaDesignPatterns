package Creation.Factory;

public class CoinFactory {
    public static Coin getCoin(CoinType coinType){
        switch (coinType){
            case GOLD:
                return new GoldCoin();
            case SILVER:
                return new SilverCoin();
            default:
                throw new RuntimeException(coinType + "is unknown");
        }
    }
}
