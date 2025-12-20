public class StringBuilders{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("yash");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'A');
        System.out.println(sb);

        sb.insert(0, "K");
        System.out.println(sb);

        sb.delete(2, 3);
        System.out.println(sb);

        sb.append("L");
        System.out.println(sb);

    }
}