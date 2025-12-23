Add a new column grade to the salesman table
ALTER TABLE salesman
ADD grade NUMBER;

Set the value of grade to 100 for all rows
UPDATE salesman
SET grade = 100;

View the updated table
SELECT * FROM salesman;