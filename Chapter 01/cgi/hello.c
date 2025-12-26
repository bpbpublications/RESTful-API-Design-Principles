#include <stdio.h>
#include <stdlib.h> // For getenv()

int main(void) {
  // Output the HTTP header
  printf("Content-Type: text/html\n\n");
  // Get the value of the USER environment variable
  char * user = getenv("USER");

  // Start the HTML output
  printf("<html><head>");
  printf("<title>Hello World</title>");
  printf("</head><body>\n");

  // Print "Hello" message, replace the env variable
  if (user) {
    printf("<h1>Hello, %s!</h1>\n", user);
  } else {
    printf("<h1>Hello, World!</h1>\n");
    // Fallback if USER is not set
  }
  // End the HTML output
  printf("</body></html>\n");
  return 0;
}
