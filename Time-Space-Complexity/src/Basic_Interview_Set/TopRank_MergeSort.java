package Basic_Interview_Set;

import java.util.*;






class Student {
    private String name;
    private int marks;
    private long regNumber;
    private int rank;

    public Student(String name, int marks, int rank) {
        this.name = name;
        this.marks = marks;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public long getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}

public class TopRank_MergeSort {
    public static void main(String[] args) {
        // Sample student data
        Student[] students = {
                new Student("John", 85, 0),
                new Student("Alice", 92, 0),
                new Student("Bob", 78, 0),
                new Student("Emily", 90, 0),
                new Student("David", 88, 0)
        };

        // Generate unique registration numbers for students
        generateUniqueRegNumbers(students);

        // Sort the students based on their marks in descending order
        mergeSort(students, 0, students.length - 1);

        // Assign ranks to the students
        assignRanks(students);

        // Print the top-ranking students
        System.out.println("Top-Ranking Students:");
        for (Student student : students) {
            System.out.println("Rank: " + student.getRank());
            System.out.println("Registration Number: " + student.getRegNumber());
            System.out.println("Name: " + student.getName());
            System.out.println("Marks: " + student.getMarks());
            System.out.println();
        }
    }

    private static void mergeSort(Student[] students, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort the left and right halves recursively
            mergeSort(students, left, mid);
            mergeSort(students, mid + 1, right);

            // Merge the sorted halves
            merge(students, left, mid, right);
        }
    }

    private static void merge(Student[] students, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] leftArray = new Student[n1];
        Student[] rightArray = new Student[n2];

        // Copy data to temporary arrays
        System.arraycopy(students, left, leftArray, 0, n1);
        System.arraycopy(students, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;

        // Merge the temporary arrays back into the original array
        while (i < n1 && j < n2) {
            if (leftArray[i].getMarks() >= rightArray[j].getMarks()) {
                students[k] = leftArray[i];
                i++;
            } else {
                students[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < n1) {
            students[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < n2) {
            students[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static void assignRanks(Student[] students) {
        students[0].setRank(1);
        int currentRank = 1;

        for (int i = 1; i < students.length; i++) {
            if (students[i].getMarks() < students[i - 1].getMarks()) {
                currentRank++;
            }
            students[i].setRank(currentRank);
        }
    }

    private static void generateUniqueRegNumbers(Student[] students) {
        Set<Long> usedNumbers = new HashSet<>();
        Random random = new Random();

        for (Student student : students) {
            long regNumber;
            do {
                regNumber = 23464623L + random.nextInt(1000);
            } while (usedNumbers.contains(regNumber));

            usedNumbers.add(regNumber);
            student.setRegNumber(regNumber);
        }
    }
}

