public class Mass_3 {
    public static void main(String[] args) {

        int [] mass = new int[] {4, -900, 19, 89151, 76};
            int temporary = mass[0];
            mass[0] = mass[mass.length -1];
            mass[mass.length -1] = temporary;
            int summ = mass[0] + mass[mass.length -3];

        System.out.println(summ);
    }
}
