package co.incubyte;

public class Response {
  String name;
  String message;

  public Response(String name, String message) {
    this.name = name;
    this.message = message;
  }

  public Response(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getMessage() {
    return message;
  }
}
