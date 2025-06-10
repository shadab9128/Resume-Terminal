import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class resume {

    // ANSI color codes for terminal formatting
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String UNDERLINE = "\u001B[4m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String PURPLE = "\u001B[35m";

    public static void main(String[] args) {
        displayLoadingAnimation();
        displayHeader();
        displaySummary();
        displaySkills();
        displayEducation();
        displayExperience();
        displayInternships();
        displayCertifications();
        displayProjects();
        displayLanguages();
        displayHobbies();
    }

    private static void displayLoadingAnimation() {
        char[] animation = {'|', '/', '-', '\\'};
        System.out.print("\nLoading Resume ");
        for (int i = 0; i < 10; i++) {
            System.out.print("\rLoading Resume " + animation[i % 4]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    private static void displayHeader() {
        System.out.println(PURPLE + BOLD + "=".repeat(100) + RESET);
        System.out.println(BOLD + centerString("MD SHADAB ALAM", 100) + RESET);
        System.out.println(PURPLE + BOLD + "=".repeat(100) + RESET);
        
        System.out.println("📞 9128051972 | ✉️ hashmishadab024@gmail.com ");
        System.out.println("🔗 LinkedIn: linkedin.com/in/md-shadab-alam-devops");
        System.out.println("💻 GitHub: github.com/shadab9128");
        System.out.println(BOLD + "-".repeat(100) + RESET);
    }

    private static void displaySummary() {
        printSectionHeader("PROFESSIONAL SUMMARY");
        System.out.println("Highly motivated and detail-oriented DevOps Engineer with a strong");
        System.out.println("foundation in CI/CD pipelines, infrastructure automation, and containerization.");
        System.out.println("Proficient in Linux, Git, Docker, Jenkins, and Golang. Skilled in");
        System.out.println("scripting with Python, Bash, and YAML. Quick learner with excellent");
        System.out.println("problem-solving skills, eager to contribute to a dynamic DevOps team.");
    }

    private static void displaySkills() {
        printSectionHeader("TECHNICAL SKILLS");
        
        System.out.println(BOLD + "Languages:" + RESET);
        printBulletPoint("Java, Python, Golang, Shell Script, HTML, CSS, C++, SQL");
        
        System.out.println(BOLD + "\nDevOps Tools:" + RESET);
        printBulletPoint("Docker, Jenkins, Git, Ansible, Kubernetes, CI/CD, Prometheus, Grafana");
        
        System.out.println(BOLD + "\nDatabases:" + RESET);
        printBulletPoint("MySQL, MongoDB, PostgreSQL, MariaDB");
        
        System.out.println(BOLD + "\nCloud Platforms:" + RESET);
        printBulletPoint("AWS (EC2, S3, VPC, Lambda)");
        
        System.out.println(BOLD + "\nOther Tools:" + RESET);
        printBulletPoint("GitHub, Tomcat, DBMS, Terraform, Helm");
    }

    private static void displayEducation() {
        printSectionHeader("EDUCATION");
        
        System.out.println(BOLD + "B.Tech in Computer Science" + RESET);
        System.out.println("  Bhagalpur College of Engineering | 2021-2024");
        System.out.println(YELLOW + "  CGPA: 7.5" + RESET);
        
        System.out.println(BOLD + "\nDiploma in Computer Engineering" + RESET);
        System.out.println("  Jamia Millia Islamia, New Delhi | 2017-2020");
        System.out.println(YELLOW + "  Score: 80%" + RESET);
    }

    private static void displayExperience() {
        printSectionHeader("WORK EXPERIENCE");
        printBulletPoint(BOLD + "DevOps Intern" + RESET + " - Elevate Labs (1 month)");
        System.out.println("  • Automated deployment processes using Jenkins and Docker");
        System.out.println("  • Implemented CI/CD pipelines for microservices architecture");
        System.out.println("  • Monitored system performance using Prometheus and Grafana");
    }

    private static void displayInternships() {
        printSectionHeader("INTERNSHIPS");
        List<String> internships = Arrays.asList(
            "Salesforce Developer Virtual Internship - Smart Internz",
            "CPA: Introduction to Networking - Cisco",
            "CPA: Cybersecurity Essentials - Cisco",
            "CPA: Programming Essentials in C++ - Cisco"
        );
        internships.forEach(resume::printBulletPoint);
    }

    private static void displayCertifications() {
        printSectionHeader("CERTIFICATIONS");
        List<String> certs = Arrays.asList(
            "Linux, Shell Scripting, JSON, Ansible, Docker, Kubernetes, Golang - KodeKloud",
            "Prometheus, Grafana, Git, Jenkins, YAML, Python - KodeKloud"
        );
        certs.forEach(resume::printBulletPoint);
    }

    private static void displayProjects() {
        printSectionHeader("TECHNICAL PROJECTS");
        
        System.out.println(BOLD + "Sample-Github-Actions-Workflow" + RESET);
        System.out.println("  CI/CD pipeline implementation using GitHub Actions");
        System.out.println(CYAN + "  github.com/shadab9128/Sample-Github-Actions-Workflow" + RESET);
        
        System.out.println(BOLD + "\nPython-Mailer-Github-Actions" + RESET);
        System.out.println("  Automated email system triggered by GitHub events");
        System.out.println(CYAN + "  github.com/shadab9128/Python-Mailer-Github-Actions" + RESET);
        
        System.out.println(BOLD + "\nDockerfile-Generator-Using-LLM" + RESET);
        System.out.println("  AI-powered Dockerfile generator using language models");
        System.out.println(CYAN + "  github.com/shadab9128/Dockerfile-Generator-Using-LLM" + RESET);
    }

    private static void displayLanguages() {
        printSectionHeader("LANGUAGES");
        System.out.println("  English  |  Hindi  |  Urdu");
    }

    private static void displayHobbies() {
        printSectionHeader("HOBBIES");
        List<String> hobbies = Arrays.asList(
            "Cricket",
            "Gardening",
            "Nature Photography"
        );
        hobbies.forEach(resume::printBulletPoint);
    }

        public static void printSectionHeader(String title) {
        String border = "=".repeat(100);
        String centeredTitle = centerString(title.toUpperCase(), 96);
        
        System.out.printf("\n%s%s%s%s\n", BOLD, BLUE, border, RESET);
        System.out.printf("%s%s│ %s │%s\n", BOLD, BLUE, centeredTitle, RESET);
        System.out.printf("%s%s%s%s\n", BOLD, BLUE, border, RESET);
    }

    private static void printBulletPoint(String text) {
        System.out.println(GREEN + "• " + RESET + text);
    }

    private static String centerString(String text, int width) {
        if (text.length() >= width) {
            return text;
        }
        int padding = (width - text.length()) / 2;
        return " ".repeat(padding) + text + " ".repeat(width - text.length() - padding);
    }
}