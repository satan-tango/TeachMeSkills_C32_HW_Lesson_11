## Here, the following task is implemented:

Pass a string as input (we will assume that this is some standard document number in a given format).
The document number has the format xxxx-yyy-xxxx-yyy-xyxy, where x is any digit, and y is a letter of the Latin alphabet (can be upper or lower case).
- Display the first two blocks of 4 digits on one line.
- Display the document number, but replace the blocks of three letters with *** (each letter will be replaced with *).
- Display only one letter from the document number in the format yyy/yyy/y/y in lower case.
- Display the letters from the document number in the format "Letters:yyy/yyy/y/y" in upper case (implemented using the StringBuilder class).
- Check whether the document number contains the sequence "abc" and display a message whether it does or not (moreover, abc and ABC are considered the same sequence).
- Check if the document number starts with the sequence 555.
- Check if the document number ends with the sequence 1a2b.
  All these methods are implemented in a separate class in static methods, each task - in a separate method.