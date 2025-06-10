#!/bin/bash

# ANSI color codes
RESET="\033[0m"
BOLD="\033[1m"
UNDERLINE="\033[4m"
BLUE="\033[34m"
CYAN="\033[36m"
GREEN="\033[32m"
YELLOW="\033[33m"
PURPLE="\033[35m"

print_centered() {
  local text="$1"
  local width=100
  local padding=$(( (width - ${#text}) / 2 ))
  printf "%*s%s%*s\n" $padding "" "$text" $padding ""
}

section_header() {
  echo -e "\n${BOLD}${BLUE}$(printf '=%.0s' {1..100})${RESET}"
  print_centered "$1"
  echo -e "${BOLD}${BLUE}$(printf '=%.0s' {1..100})${RESET}"
}

bullet_point() {
  echo -e "${GREEN}•${RESET} $1"
}

loading_animation() {
  local animation='|/-\\'
  echo -ne "\nLoading Resume "
  for i in {1..10}; do
    printf "\rLoading Resume ${animation:i%4:1}"
    sleep 0.1
  done
  echo -e "\n"
}

header() {
  echo -e "${PURPLE}${BOLD}$(printf '=%.0s' {1..100})${RESET}"
  print_centered "MD SHADAB ALAM"
  echo -e "${PURPLE}${BOLD}$(printf '=%.0s' {1..100})${RESET}"
  echo "📞 9128051972 | ✉️ hashmishadab024@gmail.com"
  echo "🔗 LinkedIn: linkedin.com/in/md-shadab-alam-devops"
  echo "💻 GitHub: github.com/shadab9128"
  echo -e "${BOLD}$(printf '-%.0s' {1..100})${RESET}"
}

summary() {
  section_header "PROFESSIONAL SUMMARY"
  echo "Highly motivated and detail-oriented DevOps Engineer with a strong"
  echo "foundation in CI/CD pipelines, infrastructure automation, and containerization."
  echo "Proficient in Linux, Git, Docker, Jenkins, and Golang."
  echo "Skilled in scripting with Python, Bash, and YAML."
}

skills() {
  section_header "TECHNICAL SKILLS"
  echo -e "${BOLD}Languages:${RESET}"
  bullet_point "Java, Python, Golang, Shell Script, HTML, CSS, C++, SQL"

  echo -e "\n${BOLD}DevOps Tools:${RESET}"
  bullet_point "Docker, Jenkins, Git, Ansible, Kubernetes, CI/CD, Prometheus, Grafana"

  echo -e "\n${BOLD}Databases:${RESET}"
  bullet_point "MySQL, MongoDB, PostgreSQL, MariaDB"

  echo -e "\n${BOLD}Cloud Platforms:${RESET}"
  bullet_point "AWS (EC2, S3, VPC, Lambda)"

  echo -e "\n${BOLD}Other Tools:${RESET}"
  bullet_point "GitHub, Tomcat, DBMS, Terraform, Helm"
}

education() {
  section_header "EDUCATION"
  echo -e "${BOLD}B.Tech in Computer Science${RESET}"
  echo "  Bhagalpur College of Engineering | 2021-2024"
  echo -e "${YELLOW}  CGPA: 7.5${RESET}"

  echo -e "\n${BOLD}Diploma in Computer Engineering${RESET}"
  echo "  Jamia Millia Islamia, New Delhi | 2017-2020"
  echo -e "${YELLOW}  Score: 80%${RESET}"
}

experience() {
  section_header "WORK EXPERIENCE"
  bullet_point "${BOLD}DevOps Intern${RESET} - Elevate Labs (1 month)"
  echo "  • Automated deployment using Jenkins and Docker"
  echo "  • Implemented CI/CD pipelines for microservices"
  echo "  • Monitored systems using Prometheus and Grafana"
}

internships() {
  section_header "INTERNSHIPS"
  bullet_point "Salesforce Developer Virtual Internship - Smart Internz"
  bullet_point "CPA: Introduction to Networking - Cisco"
  bullet_point "CPA: Cybersecurity Essentials - Cisco"
  bullet_point "CPA: Programming Essentials in C++ - Cisco"
}

certifications() {
  section_header "CERTIFICATIONS"
  bullet_point "Linux, Shell Scripting, JSON, Ansible, Docker, Kubernetes, Golang - KodeKloud"
  bullet_point "Prometheus, Grafana, Git, Jenkins, YAML, Python - KodeKloud"
}

projects() {
  section_header "TECHNICAL PROJECTS"
  echo -e "${BOLD}Sample-Github-Actions-Workflow${RESET}"
  echo "  CI/CD pipeline using GitHub Actions"
  echo -e "${CYAN}  github.com/shadab9128/Sample-Github-Actions-Workflow${RESET}"

  echo -e "\n${BOLD}Python-Mailer-Github-Actions${RESET}"
  echo "  Email automation with GitHub triggers"
  echo -e "${CYAN}  github.com/shadab9128/Python-Mailer-Github-Actions${RESET}"

  echo -e "\n${BOLD}Dockerfile-Generator-Using-LLM${RESET}"
  echo "  AI-based Dockerfile generator"
  echo -e "${CYAN}  github.com/shadab9128/Dockerfile-Generator-Using-LLM${RESET}"
}

languages() {
  section_header "LANGUAGES"
  echo "  English  |  Hindi  |  Urdu"
}

hobbies() {
  section_header "HOBBIES"
  bullet_point "Cricket"
  bullet_point "Gardening"
  bullet_point "Nature Photography"
}

# Main Execution
loading_animation
header
summary
skills
education
experience
internships
certifications
projects
languages
hobbies
