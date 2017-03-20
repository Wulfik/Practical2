public class Main {

    public static void main(String[] args) {

        SampleFamilyProvider a = new SampleFamilyProvider();
        System.out.println( a.makeFamilyTree().getName());
        SampleFamilyProvider b = new SampleFamilyProvider();
        System.out.println( b.makeFamilyTree().getFather().getName());
        SampleFamilyProvider c = new SampleFamilyProvider();
        System.out.println( c.makeFamilyTree().getMother().getFather().getName());
        SampleFamilyProvider d = new SampleFamilyProvider();
        System.out.println( d.makeFamilyTree().getMother().getMother().getName());
        SampleFamilyProvider e = new SampleFamilyProvider();
        System.out.println( e.makeFamilyTree().getFather().getFather().getName());

    }
}
