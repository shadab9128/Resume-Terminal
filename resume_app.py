import sys
import time

# Color codes for terminal formatting
class Colors:
    HEADER = '\033[95m'
    BLUE = '\033[94m'
    CYAN = '\033[96m'
    GREEN = '\033[92m'
    YELLOW = '\033[93m'
    RED = '\033[91m'
    BOLD = '\033[1m'
    UNDERLINE = '\033[4m'
    END = '\033[0m'

def print_section_header(title):
    print(f"\n{Colors.BOLD}{Colors.BLUE}{'='*100}")
    print(f"│ {title.upper().center(96)} │")
    print(f"{'='*100}{Colors.END}")

def print_bullet_point(text, indent=0):
    indent_space = "  " * indent
    print(f"{indent_space}{Colors.GREEN}•{Colors.END} {text}")

def print_link(name, url):
    print(f"{Colors.YELLOW}{Colors.UNDERLINE}{name}{Colors.END}: {Colors.CYAN}{url}{Colors.END}")

def display_header():
    print(f"\n{Colors.BOLD}{Colors.HEADER}{'='*100}")
    print(f"{'MD SHADAB ALAM'.center(100)}")
    print(f"{'='*100}{Colors.END}")
    
    contact_info = [
        f"{Colors.BOLD}📞{Colors.END} 9128051972",
        f"{Colors.BOLD}✉️{Colors.END} hashmishadab024@gmail.com",
    ]
    print("  |  ".join(contact_info))
    
    links = [
        f"{Colors.BOLD}🔗{Colors.END} {Colors.CYAN}LinkedIn{Colors.END}: linkedin.com/in/md-shadab-alam-devops",
        f"{Colors.BOLD}💻{Colors.END} {Colors.CYAN}GitHub{Colors.END}: github.com/shadab9128"
    ]
    print("  |  ".join(links))
    print(f"{Colors.BOLD}{'-'*100}{Colors.END}")

def display_summary():
    print_section_header("Professional Summary")
    summary = [
        "Highly motivated and detail-oriented DevOps Engineer with a strong",
        "foundation in CI/CD pipelines, infrastructure automation, and containerization.",
        "Proficient in Linux, Git, Docker, Jenkins, and Golang. Skilled in",
        "scripting with Python, Bash, and YAML. Quick learner with excellent",
        "problem-solving skills, eager to contribute to a dynamic DevOps team."
    ]
    for line in summary:
        print(f"  {line}")

def display_skills():
    print_section_header("Technical Skills")
    skills = {
        "Languages": "Java, Python, Golang, Shell Script, HTML, CSS, C++, SQL",
        "DevOps Tools": "Docker, Jenkins, Git, Ansible, Kubernetes, CI/CD, Prometheus, Grafana",
        "Databases": "MySQL, MongoDB, PostgreSQL, MariaDB",
        "Cloud Platforms": "AWS",
        "Other Tools": "GitHub, Tomcat, DBMS, Terraform, Helm"
    }
    for category, items in skills.items():
        print(f"\n{Colors.BOLD}{category}:{Colors.END}")
        for item in items.split(", "):
            print(f"  • {item}")

def display_education():
    print_section_header("Education")
    education = [
        ("B.Tech in Computer Science", "Bhagalpur College of Engineering", "2021-2024", "CGPA: 7.5"),
        ("Diploma in Computer Engineering", "Jamia Millia Islamia, New Delhi", "2017-2020", "Score: 80%")
    ]
    for degree, institution, years, score in education:
        print(f"\n{Colors.BOLD}{degree}{Colors.END}")
        print(f"  {institution} | {years}")
        print(f"  {Colors.YELLOW}{score}{Colors.END}")

def display_experience():
    print_section_header("Work Experience")
    print_bullet_point(f"{Colors.BOLD}DevOps Intern{Colors.END} - Elevate Labs (1 month)")
    print("  • Automated deployment processes using Jenkins and Docker")
    print("  • Implemented CI/CD pipelines for microservices architecture")
    print("  • Monitored system performance using Prometheus and Grafana")

def display_internships():
    print_section_header("Internships")
    internships = [
        "Salesforce Developer Virtual Internship - Smart Internz",
        "CPA: Introduction to Networking - Cisco",
        "CPA: Cybersecurity Essentials - Cisco",
        "CPA: Programming Essentials in C++ - Cisco"
    ]
    for internship in internships:
        print_bullet_point(internship)

def display_certifications():
    print_section_header("Certifications")
    certs = [
        "Linux, Shell Scripting, JSON, Ansible, Docker, Kubernetes, Golang - KodeKloud",
        "Prometheus, Grafana, Git, Jenkins, YAML, Python - KodeKloud"
    ]
    for cert in certs:
        print_bullet_point(cert)

def display_projects():
    print_section_header("Technical Projects")
    projects = [
        ("Sample-Github-Actions-Workflow", "CI/CD pipeline implementation using GitHub Actions"),
        ("Python-Mailer-Github-Actions", "Automated email system triggered by GitHub events"),
        ("React-CI-Cd-Setup", "Full CI/CD pipeline for React application"),
        ("Dockerfile-Generator-Using-LLM", "AI-powered Dockerfile generator using language models"),
        ("Scripting-AWS-VPC", "Automated AWS VPC setup using Python scripts")
    ]
    for name, desc in projects:
        print(f"\n{Colors.BOLD}{name}{Colors.END}")
        print(f"  {desc}")
        print(f"  {Colors.CYAN}github.com/shadab9128/{name}{Colors.END}")

def display_languages():
    print_section_header("Languages")
    langs = ["English", "Hindi", "Urdu"]
    print("  " + "  |  ".join(langs))

def display_hobbies():
    print_section_header("Hobbies")
    hobbies = [
        "Cricket",
        "Gardening",
        "Nature Photography"
    ]
    for hobby in hobbies:
        print_bullet_point(hobby)

def animate_loading():
    animation = "|/-\\"
    for i in range(10):
        time.sleep(0.1)
        sys.stdout.write("\r" + "Loading resume " + animation[i % len(animation)])
        sys.stdout.flush()

def main():
    animate_loading()
    display_header()
    display_summary()
    display_skills()
    display_education()
    display_experience()
    display_internships()
    display_certifications()
    display_projects()
    display_languages()
    display_hobbies()

if __name__ == "__main__":
    main()