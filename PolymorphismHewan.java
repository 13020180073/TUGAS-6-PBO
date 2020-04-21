public class PolymorphismHewan
{
    public static void main(String[] args) 
    {
        PolymorphismMakhluk tombol;
        PolymorphismMamalia mamalia=new PolymorphismMamalia();
        PolymorphismSapi sapiSumba=new PolymorphismSapi();
        tombol=mamalia;
        tombol.info();      //polymorphism
        tombol=sapiSumba;
        tombol.info();      //polymorphism
    }
}