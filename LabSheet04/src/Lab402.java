import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String student_id = JOptionPane.showInputDialog("Enter student-id:");
        String major = " ";
        //2513110151
        System.out.println(student_id.substring(2,5));
        if(student_id.substring(2,5).endsWith("131") == true ){
            major = "Information Technology (IT)";
        }
        else if(student_id.substring(2,5).endsWith("132") == true){
            major = "Multimedia Technology (MT)";
        }

        else if(student_id.substring(2,5).endsWith("133") == true ){
            major = "Digital Business Information Technology (BI)";
        }
        else if(student_id.substring(2,5).endsWith("134") == true ){
            major = "Digital Technology in Mass Communication (DC)";
        }
        else if(student_id.substring(2,5).endsWith("135") == true ){
            major = "Data Science and Data Analytics (DS)";
        }
        else {
            major = "Cannot found major";
        }
        JOptionPane.showMessageDialog(null,"Student ID:"+student_id+"\nMajor: "+major);

    }
}
 