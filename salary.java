                public class salary {
                    public static void main(String[] args) {
                        String name = "Fridah";
                        int workingHours = 40;
                        int salaryPerHour = 500;
                        int advances = 5000;
                        int totalSalary = workingHours * salaryPerHour;

                        System.out.println("Name: " + name);
                        System.out.println("Total Salary: " + totalSalary);
                        System.out.println("Salary after advances: " + (totalSalary - advances));

                        if (workingHours == 15) {
                            System.out.println("Total Salary: " + totalSalary);
                            System.out.println("Working Hours: " + workingHours);
                            System.out.println("Salary per Hour: " + salaryPerHour);
                        } else if (workingHours >= 40) {
                            System.out.println("Total Salary: " + totalSalary);
                            System.out.println("advances: " + advances);
                        }
                    }
                }
