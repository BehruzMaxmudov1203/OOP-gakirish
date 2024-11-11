package Inheritance_mavzusi;

class Doctor {
    private String mutaxassislik; // Shifokorning mutaxassisligi

    // Mutaxassislikni belgilash uchun setter metodi
    public void setMutaxassislik(String mutaxassislik) {
        this.mutaxassislik = mutaxassislik;
    }

    // Mutaxassislikni olish uchun getter metodi
    public String getMutaxassislik() {
        return this.mutaxassislik;
    }
}

// Xirurg (Jarroh) sinfi
class Xirurg extends Doctor { // Doctor sinfidan vorislik qiladi
    private String jarrohlikMahorati; // Jarrohlik mahorati

    // Jarrohlik mahoratini belgilash uchun setter metodi
    public void setJarrohlikMahorati(String jarrohlikMahorati) {
        this.jarrohlikMahorati = jarrohlikMahorati;
    }

    // Jarrohlik mahoratini olish uchun getter metodi
    public String getJarrohlikMahorati() {
        return this.jarrohlikMahorati;
    }
}


class Lor extends Doctor { // Doctor sinfidan vorislik qiladi
    private String quloqBurunTomoqMahorati;


    public void setQuloqBurunTomoqMahorati(String quloqBurunTomoqMahorati) {
        this.quloqBurunTomoqMahorati = quloqBurunTomoqMahorati;
    }

    // Quloq-burun-tomoq davolash mahoratini olish uchun getter metodi
    public String getQuloqBurunTomoqMahorati() {
        return this.quloqBurunTomoqMahorati;
    }
}

// Main (Asosiy) sinfi
public class m_1 {
    public static void main(String[] args) {
        // Sinflardan ob'yektlar yaratamiz
        Xirurg xirurg = new Xirurg();
        Lor lor = new Lor();

        // Ob'yektlarning xususiyatlarini belgilaymiz
        xirurg.setMutaxassislik("Jarrohlik");
        xirurg.setJarrohlikMahorati("Neyrojarrohlik");
        lor.setMutaxassislik("Quloq-burun-tomoq shifokori");
        lor.setQuloqBurunTomoqMahorati("Laringologiya");

        // Ob'yektlar haqida ma'lumotlarni chop etamiz
        System.out.println("Xirurg: Mutaxassisligi - " + xirurg.getMutaxassislik() + ", Jarrohlik mahorati - " + xirurg.getJarrohlikMahorati());
        System.out.println("Lor: Mutaxassisligi - " + lor.getMutaxassislik() + ", Quloq-burun-tomoq davolash mahorati - " + lor.getQuloqBurunTomoqMahorati());
    }
}