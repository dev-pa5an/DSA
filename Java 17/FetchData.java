
//     private final int id;
//     private final String name;

//     public Student(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public int hashCode() {
//         int hash = 5;
//         hash = 97 * hash + this.id;
//         hash = 97 * hash + Objects.hashCode(this.name);
//         return hash;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) {
//             return true;
//         }
//         if (obj == null) {
//             return false;
//         }
//         if (getClass() != obj.getClass()) {
//             return false;
//         }
//         final Student other = (Student) obj;
//         if (this.id != other.id) {
//             return false;
//         }
//         return Objects.equals(this.name, other.name);
//     }

//     @Override
//     public String toString() {
//         return "Student [id=" + id + ", name=" + name + "]";
//     }
    

// }

record Student (int id, String name) {}

public class FetchData{
    public static void main(String[] args) {
        Student s1 = new Student(1, "Pasan");
        Student s2 = new Student(1, "Pasan");

        System.out.println(s1.equals(s2));
    }
}