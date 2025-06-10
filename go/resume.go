package main

import (
	"fmt"
	"strings"
	"time"
)

const (
	RESET     = "\u001B[0m"
	BOLD      = "\u001B[1m"
	UNDERLINE = "\u001B[4m"
	BLUE      = "\u001B[34m"
	CYAN      = "\u001B[36m"
	GREEN     = "\u001B[32m"
	YELLOW    = "\u001B[33m"
	PURPLE    = "\u001B[35m"
)

func main() {
	displayLoadingAnimation()
	displayHeader()
	displaySummary()
	displaySkills()
	displayEducation()
	displayExperience()
	displayInternships()
	displayCertifications()
	displayProjects()
	displayLanguages()
	displayHobbies()
}

func displayLoadingAnimation() {
	animation := []rune{'|', '/', '-', '\\'}
	fmt.Print("\nLoading Resume ")
	for i := 0; i < 10; i++ {
		fmt.Printf("\rLoading Resume %c", animation[i%4])
		time.Sleep(100 * time.Millisecond)
	}
	fmt.Println()
}

func displayHeader() {
	fmt.Println(PURPLE + BOLD + strings.Repeat("=", 100) + RESET)
	fmt.Println(BOLD + centerString("MD SHADAB ALAM", 100) + RESET)
	fmt.Println(PURPLE + BOLD + strings.Repeat("=", 100) + RESET)

	fmt.Println("📞 9128051972 | ✉️ hashmishadab024@gmail.com")
	fmt.Println("🔗 LinkedIn: linkedin.com/in/md-shadab-alam-devops")
	fmt.Println("💻 GitHub: github.com/shadab9128")
	fmt.Println(BOLD + strings.Repeat("-", 100) + RESET)
}

func displaySummary() {
	printSectionHeader("PROFESSIONAL SUMMARY")
	fmt.Println("Highly motivated and detail-oriented DevOps Engineer with a strong")
	fmt.Println("foundation in CI/CD pipelines, infrastructure automation, and containerization.")
	fmt.Println("Proficient in Linux, Git, Docker, Jenkins, and Golang. Skilled in")
	fmt.Println("scripting with Python, Bash, and YAML. Quick learner with excellent")
	fmt.Println("problem-solving skills, eager to contribute to a dynamic DevOps team.")
}

func displaySkills() {
	printSectionHeader("TECHNICAL SKILLS")

	fmt.Println(BOLD + "Languages:" + RESET)
	printBullet("Java, Python, Golang, Shell Script, HTML, CSS, C++, SQL")

	fmt.Println(BOLD + "\nDevOps Tools:" + RESET)
	printBullet("Docker, Jenkins, Git, Ansible, Kubernetes, CI/CD, Prometheus, Grafana")

	fmt.Println(BOLD + "\nDatabases:" + RESET)
	printBullet("MySQL, MongoDB, PostgreSQL, MariaDB")

	fmt.Println(BOLD + "\nCloud Platforms:" + RESET)
	printBullet("AWS (EC2, S3, VPC, Lambda)")

	fmt.Println(BOLD + "\nOther Tools:" + RESET)
	printBullet("GitHub, Tomcat, DBMS, Terraform, Helm")
}

func displayEducation() {
	printSectionHeader("EDUCATION")

	fmt.Println(BOLD + "B.Tech in Computer Science" + RESET)
	fmt.Println("  Bhagalpur College of Engineering | 2021-2024")
	fmt.Println(YELLOW + "  CGPA: 7.5" + RESET)

	fmt.Println(BOLD + "\nDiploma in Computer Engineering" + RESET)
	fmt.Println("  Jamia Millia Islamia, New Delhi | 2017-2020")
	fmt.Println(YELLOW + "  Score: 80%" + RESET)
}

func displayExperience() {
	printSectionHeader("WORK EXPERIENCE")
	printBullet(BOLD + "DevOps Intern" + RESET + " - Elevate Labs (1 month)")
	fmt.Println("  • Automated deployment processes using Jenkins and Docker")
	fmt.Println("  • Implemented CI/CD pipelines for microservices architecture")
	fmt.Println("  • Monitored system performance using Prometheus and Grafana")
}

func displayInternships() {
	printSectionHeader("INTERNSHIPS")
	internships := []string{
		"Salesforce Developer Virtual Internship - Smart Internz",
		"CPA: Introduction to Networking - Cisco",
		"CPA: Cybersecurity Essentials - Cisco",
		"CPA: Programming Essentials in C++ - Cisco",
	}
	for _, i := range internships {
		printBullet(i)
	}
}

func displayCertifications() {
	printSectionHeader("CERTIFICATIONS")
	certs := []string{
		"Linux, Shell Scripting, JSON, Ansible, Docker, Kubernetes, Golang - KodeKloud",
		"Prometheus, Grafana, Git, Jenkins, YAML, Python - KodeKloud",
	}
	for _, c := range certs {
		printBullet(c)
	}
}

func displayProjects() {
	printSectionHeader("TECHNICAL PROJECTS")

	fmt.Println(BOLD + "Sample-Github-Actions-Workflow" + RESET)
	fmt.Println("  CI/CD pipeline implementation using GitHub Actions")
	fmt.Println(CYAN + "  github.com/shadab9128/Sample-Github-Actions-Workflow" + RESET)

	fmt.Println(BOLD + "\nPython-Mailer-Github-Actions" + RESET)
	fmt.Println("  Automated email system triggered by GitHub events")
	fmt.Println(CYAN + "  github.com/shadab9128/Python-Mailer-Github-Actions" + RESET)

	fmt.Println(BOLD + "\nDockerfile-Generator-Using-LLM" + RESET)
	fmt.Println("  AI-powered Dockerfile generator using language models")
	fmt.Println(CYAN + "  github.com/shadab9128/Dockerfile-Generator-Using-LLM" + RESET)
}

func displayLanguages() {
	printSectionHeader("LANGUAGES")
	fmt.Println("  English  |  Hindi  |  Urdu")
}

func displayHobbies() {
	printSectionHeader("HOBBIES")
	hobbies := []string{
		"Cricket",
		"Gardening",
		"Nature Photography",
	}
	for _, h := range hobbies {
		printBullet(h)
	}
}

func printSectionHeader(title string) {
	border := strings.Repeat("=", 100)
	centered := centerString(title, 96)

	fmt.Printf("\n%s%s%s%s\n", BOLD, BLUE, border, RESET)
	fmt.Printf("%s%s│ %s │%s\n", BOLD, BLUE, centered, RESET)
	fmt.Printf("%s%s%s%s\n", BOLD, BLUE, border, RESET)
}

func printBullet(text string) {
	fmt.Println(GREEN + "• " + RESET + text)
}

func centerString(text string, width int) string {
	if len(text) >= width {
		return text
	}
	padding := (width - len(text)) / 2
	return strings.Repeat(" ", padding) + text + strings.Repeat(" ", width-len(text)-padding)
}
