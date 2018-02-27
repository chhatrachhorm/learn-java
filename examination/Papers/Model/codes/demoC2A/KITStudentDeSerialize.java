package Papers.Model.codes.demoC2A;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class KITStudentDeSerialize {
    public static void main(String args[]){
        try{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Examination/Papers/model/Codes/StudentObj.bin"));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Student s = (Student)ois.readObject();
            System.out.println(s.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
