
import org.junit.Assert;
import org.junit.Test;


public class TreeTest {

    @Test
    public void test_SanityTest_JUnitWorks(){
        Assert.assertEquals(2, 1+1);
    }

    @Test
    public void test_FamilyTree_Yuriy (){
        Assert.assertEquals ("Юрій", new SampleFamilyProvider().makeFamilyTree().getName());
    }

    @Test
    public void test_FamilyTree_FatherYuriy(){
        Assert.assertEquals ("Остап",new SampleFamilyProvider().makeFamilyTree().getFather().getName());
    }

    @Test
    public void test_FamilyTree_UnknownOstapGrandFather (){
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getFather().getFather().getName());
    }

    @Test
    public void test_FamilyTree_UnknownOstapGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getFather().getMother().getName());
    }

    @Test
    public void test_FamilyTree_UnknownOstapGrandGrandFather () {
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getFather().getFather().getFather().getName());
    }

    @Test
    public void test_FamilyTree_UnknownOstapGrandGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getFather().getFather().getMother().getName());
    }

    @Test
    public void test_FamilyTree_UnknownKatyaGrandGrandFather () {
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getFather().getMother().getFather().getName());
    }

    @Test
    public void test_FamilyTree_UnknownKatyaGrandGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getFather().getMother().getMother().getName());
    }

    @Test
    public void test_FamilyTree_MotherYuriy () {
        Assert.assertEquals("Катя", new SampleFamilyProvider().makeFamilyTree().getMother().getName());
    }

    @Test
    public void test_FamilyTree_KatyaMother () {
        Assert.assertEquals("Марина", new SampleFamilyProvider().makeFamilyTree().getMother(). getMother().getName());
    }

    @Test
    public void test_FamilyTree_KatyaFather () {
        Assert.assertEquals("Іван", new SampleFamilyProvider().makeFamilyTree().getMother().getFather().getName());
    }

    @Test
    public void test_FamilyTree_UnknownKatyaGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getMother().getMother().getMother().getName());
    }

    @Test
    public void test_FamilyTree_UnknownKatyaGrandFather () {
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getMother().getMother().getFather().getName());
    }

    @Test
    public void test_FamilyTree_UnknownKatyaGrandGrandMother2 () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getMother().getFather().getMother().getName());
    }

    @Test
    public void test_FamilyTree_UnknownKatyaFourthGrandGrandFather () {
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getMother().getFather().getFather().getName());
    }
}