provider "aws" {
  region = "ap-south-1" # Mumbai
}

resource "aws_instance" "mini_finance_web" {
  ami           = "ami-0f5ee92e2d63afc18"  # Ubuntu 22.04 LTS (Mumbai) — verify latest!
  instance_type = "t2.micro"

  user_data = <<-EOF
              #!/bin/bash
              apt update
              apt install -y apache2 wget unzip vim
              cd /var/www/html
              wget https://www.tooplate.com/zip-templates/2135_mini_finance.zip
              unzip 2135_mini_finance.zip
              mv 2135_mini_finance/* .
              rm -rf 2135_mini_finance*
              systemctl restart apache2
            EOF

  vpc_security_group_ids = [aws_security_group.web_sg.id]

  tags = {
    Name = "MiniFinanceWeb"
  }
}

resource "aws_security_group" "web_sg" {
  name        = "mini-finance-sg"
  description = "Allow HTTP and SSH traffic"

  ingress {
    description = "Allow SSH"
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  ingress {
    description = "Allow HTTP"
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  egress {
    description = "Allow all outbound"
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }
}
