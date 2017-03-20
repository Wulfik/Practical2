public class Main {

    public static void main(String[] args) {

        SampleFamilyProvider test = new SampleFamilyProvider();
        System.out.println( test.makeFamilyTree().getFather().getName());


    }
}
