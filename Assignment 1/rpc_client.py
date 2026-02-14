import xmlrpc.client

# Connect to server (replace IP with cloud VM public IP)
proxy = xmlrpc.client.ServerProxy("http://13.233.108.133:8000/")

try:
    a, b = 10, 5
    print("Addition:", proxy.add(a, b))
    print("Multiplication:", proxy.multiply(a, b))
except Exception as e:
    print("Error:", e)
