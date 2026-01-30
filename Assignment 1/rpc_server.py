from xmlrpc.server import SimpleXMLRPCServer
from xmlrpc.server import SimpleXMLRPCRequestHandler

# Restrict to a specific path
class RequestHandler(SimpleXMLRPCRequestHandler):
    rpc_paths = ('/RPC2',)

# Create server
server = SimpleXMLRPCServer(("0.0.0.0", 8000),
                            requestHandler=RequestHandler,
                            allow_none=True)
server.register_introspection_functions()

# Remote procedures
def add(a, b):
    return a + b

def multiply(a, b):
    return a * b

# Register functions
server.register_function(add, "add")
server.register_function(multiply, "multiply")

print("RPC Server running on port 8000...")
server.serve_forever()
