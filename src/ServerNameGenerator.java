public class ServerNameGenerator {
    private static String[] adj = {"beautiful", "strong", "kind", "caring", "powerful", "proud", "colorful", "wild", "free", "loving"};
    private static String[] noun = {"dog", "cat", "rabbit", "snake", "bear", "deer", "bird", "fish", "butterfly", "fox"};

    private static String randomE(String[] strings){
        int ranNum = (int) (Math.random() * strings.length);
        return strings[ranNum];
    }

    public static String makeServerName (String[] array1, String[] array2){
        String adj = randomE(array1);
        String noun = randomE(array2);
        return adj + "-" + noun;

    }

    public static void main(String[] args) {
        System.out.println(makeServerName(adj, noun));
    }
}
