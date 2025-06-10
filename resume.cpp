#include <iostream>
#include <vector>
#include <thread>
#include <chrono>
#include <string>
#include <iomanip>

using namespace std;

// ANSI codes
const string RESET = "\033[0m";
const string BOLD = "\033[1m";
const string UNDERLINE = "\033[4m";
const string BLUE = "\033[34m";
const string CYAN = "\033[36m";
const string GREEN = "\033[32m";
const string YELLOW = "\033[33m";
const string PURPLE = "\033[35m";

// Function declarations
void displayLoadingAnimation();
void displayHeader();
void displaySummary();
void displaySkills();
void displayEducation();
void displayExperience();
void displayInternships();
void displayCertifications();
void displayProjects();
void displayLanguages();
void displayHobbies();
void printSectionHeader(const string &title);
void printBulletPoint(const string &text);
string centerString(const string &text, int width);

int main() {
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
    return 0;
}

void displayLoadingAnimation() {
    char animation[] = {'|', '/', '-', '\\'};
    cout << "\nLoading Resume ";
    for (int i = 0; i < 10; ++i) {
        cout << "\rLoading Resume " << animation[i % 4] << flush;
        this_thread::sleep_for(chrono::milliseconds(100));
    }
    cout << endl;
}

void displayHeader() {
    cout << PURPLE << BOLD << string(100, '=') << RESET << endl;
    cout << BOLD << centerString("MD SHADAB ALAM", 100) << RESET << endl;
    cout << PURPLE << BOLD << string(100, '=') << RESET << endl;
    cout << "📞 9128051972 | ✉️ hashmishadab024@gmail.com\n";
    cout << "🔗 LinkedIn: linkedin.com/in/md-shadab-alam-devops\n";
    cout << "💻 GitHub: github.com/shadab9128\n";
    cout << BOLD << string(100, '-') << RESET << endl;
}

void displaySummary() {
    printSectionHeader("Professional Summary");
    cout << "Highly motivated and detail-oriented DevOps Engineer with a strong\n";
    cout << "foundation in CI/CD pipelines, infrastructure automation, and containerization.\n";
    cout << "Proficient in Linux, Git, Docker, Jenkins, and Golang. Skilled in\n";
    cout << "scripting with Python, Bash, and YAML. Quick learner with excellent\n";
    cout << "problem-solving skills, eager to contribute to a dynamic DevOps team.\n";
}

void displaySkills() {
    printSectionHeader("Technical Skills");

    cout << BOLD << "Languages: " << RESET << endl;
    printBulletPoint("Java, Python, Golang, Shell Script, HTML, CSS, C++, SQL");

    cout << "\n" << BOLD << "DevOps Tools: " << RESET << endl;
    printBulletPoint("Docker, Jenkins, Git, Ansible, Kubernetes, CI/CD, Prometheus, Grafana");

    cout << "\n" << BOLD << "Databases: " << RESET << endl;
    printBulletPoint("MySQL, MongoDB, PostgreSQL, MariaDB");

    cout << "\n" << BOLD << "Cloud Platforms: " << RESET << endl;
    printBulletPoint("AWS (EC2, S3, VPC, Lambda)");

    cout << "\n" << BOLD << "Other Tools: " << RESET << endl;
    printBulletPoint("GitHub, Tomcat, DBMS, Terraform, Helm");
}

void displayEducation() {
    printSectionHeader("Education");

    cout << BOLD << "B.Tech in Computer Science" << RESET << endl;
    cout << "  Bhagalpur College of Engineering | 2021-2024" << endl;
    cout << YELLOW << "  CGPA: 7.5" << RESET << endl;

    cout << "\n" << BOLD << "Diploma in Computer Engineering" << RESET << endl;
    cout << "  Jamia Millia Islamia, New Delhi | 2017-2020" << endl;
    cout << YELLOW << "  Score: 80%" << RESET << endl;
}

void displayExperience() {
    printSectionHeader("Work Experience");

    printBulletPoint(BOLD + string("DevOps Intern") + RESET + " - Elevate Labs (1 month)");
    cout << "  • Automated deployment processes using Jenkins and Docker\n";
    cout << "  • Implemented CI/CD pipelines for microservices architecture\n";
    cout << "  • Monitored system performance using Prometheus and Grafana\n";
}

void displayInternships() {
    printSectionHeader("Internships");

    vector<string> internships = {
        "Salesforce Developer Virtual Internship - Smart Internz",
        "CPA: Introduction to Networking - Cisco",
        "CPA: Cybersecurity Essentials - Cisco",
        "CPA: Programming Essentials in C++ - Cisco"
    };

    for (const auto &i : internships) printBulletPoint(i);
}

void displayCertifications() {
    printSectionHeader("Certifications");

    vector<string> certs = {
        "Linux, Shell Scripting, JSON, Ansible, Docker, Kubernetes, Golang - KodeKloud",
        "Prometheus, Grafana, Git, Jenkins, YAML, Python - KodeKloud"
    };

    for (const auto &c : certs) printBulletPoint(c);
}

void displayProjects() {
    printSectionHeader("Technical Projects");

    cout << BOLD << "Sample-Github-Actions-Workflow" << RESET << endl;
    cout << "  CI/CD pipeline implementation using GitHub Actions" << endl;
    cout << CYAN << "  github.com/shadab9128/Sample-Github-Actions-Workflow" << RESET << endl;

    cout << "\n" << BOLD << "Python-Mailer-Github-Actions" << RESET << endl;
    cout << "  Automated email system triggered by GitHub events" << endl;
    cout << CYAN << "  github.com/shadab9128/Python-Mailer-Github-Actions" << RESET << endl;

    cout << "\n" << BOLD << "Dockerfile-Generator-Using-LLM" << RESET << endl;
    cout << "  AI-powered Dockerfile generator using language models" << endl;
    cout << CYAN << "  github.com/shadab9128/Dockerfile-Generator-Using-LLM" << RESET << endl;
}

void displayLanguages() {
    printSectionHeader("Languages");
    cout << "  English  |  Hindi  |  Urdu\n";
}

void displayHobbies() {
    printSectionHeader("Hobbies");

    vector<string> hobbies = {
        "Cricket",
        "Gardening",
        "Nature Photography"
    };

    for (const auto &h : hobbies) printBulletPoint(h);
}

void printSectionHeader(const string &title) {
    string border = string(100, '=');
    cout << "\n" << BOLD << BLUE << border << RESET << endl;
    cout << BOLD << BLUE << "│ " << centerString(title, 96) << " │" << RESET << endl;
    cout << BOLD << BLUE << border << RESET << endl;
}

void printBulletPoint(const string &text) {
    cout << GREEN << "• " << RESET << text << endl;
}

string centerString(const string &text, int width) {
    if (text.length() >= width) return text;
    int padding = (width - text.length()) / 2;
    return string(padding, ' ') + text + string(width - text.length() - padding, ' ');
}
