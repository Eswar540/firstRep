import socket
hostname = input("Enter the website address")
print(f'The {hostname} ip address is {socket.gethostbyname(hostname)}')
