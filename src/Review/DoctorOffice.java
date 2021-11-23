package Review;

public class DoctorOffice {
    public static void main(String[] args) {
        Doctor doctor=new Doctor("John","Doe","ENT");
        System.out.println(doctor.name);
        System.out.println(doctor.lastName);
        System.out.println(doctor.speciality);
        System.out.println(doctor.salary);
        System.out.println();


    }
}
