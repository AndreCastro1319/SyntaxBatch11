package Class19.Task3;

public class Task2 {
//Write a Java program called Teacher.
//	Identify features and behaviour of that Class.
//	Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
//	that would have it their own features and behaviour. Test all 4 classes
    public static void main(String[]args){
        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Demir";
        mathTeacher.teachMath();

        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Jimmy";
        chemistryTeacher.teachChemistry();

    }

    }
    class Teacher{
    String name;
        void teach(){
        System.out.println("Teaches subjects");
    }
        }
    class MathTeacher extends Teacher{
        void teachMath(){
            System.out.println(name+"Teaches math");
        }

    }
    class ChemistryTeacher extends Teacher{
        void teachChemistry() {
            System.out.println(name + "Teaches chemistry");
        }
    }
    class PianoTeacher extends Teacher{
        void teachPiano() {
        System.out.println(name + "Teaches piano");
        }
    }
