public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(32,11,2002);
        Data data2 = new Data(13,2,2023);

//        Conta testaConta = new Conta(1111,"0001",842.4, data1);
//        Conta c2 = new Conta("Rildo", 1111, "0001", 920, data2);
//
//        c2.sacar(200);
//        System.out.println(c2.recuperaDadosParaImpressao());
//        System.out.println("------------------");
//        testaConta.depositar(820);
//        System.out.println(testaConta.recuperaDadosParaImpressao());

        Conta c04 = new Conta("Maria", 2323, "0001", 2000, data1);
        System.out.println(c04.recuperaDadosParaImpressao());

       }
    }