use selva;
CREATE TABLE Studentses (
  student_id INT PRIMARY KEY,
  name VARCHAR(50),
  class VARCHAR(10)
);

-- Marks table
CREATE TABLE Marks (
  mark_id INT PRIMARY KEY AUTO_INCREMENT,
  student_id INT,
  subject VARCHAR(50),
  marks INT,
  FOREIGN KEY (student_id) REFERENCES Studentses(student_id)
);
	
-- Students
INSERT INTO Studentses (student_id, name, class) VALUES
(1, 'Arjun', '10A'),
(2, 'Bala', '10B'),
(3, 'Cathy', '10A'),
(4, 'Dinesh', '10C');

-- Marks
INSERT INTO Marks (student_id, subject, marks) VALUES
(1, 'Maths', 95),
(1, 'Science', 88),
(2, 'Maths', 65),
(3, 'Maths', 80),
(3, 'Science', 92),
(4, 'English', 76);

SELECT s.name, s.class, m.subject, m.marks
FROM Studentses s
INNER JOIN Marks m ON s.student_id = m.student_id;

SELECT s.name, m.subject, m.marks
FROM Studentses s
LEFT JOIN Marks m ON s.student_id = m.student_id;

SELECT s.name, m.subject, m.marks
FROM Studentses s
RIGHT JOIN Marks m ON s.student_id = m.student_id;

SELECT DISTINCT student_id
FROM Marks
WHERE marks > 80;

SELECT name
FROM Studentses
WHERE student_id IN (
    SELECT student_id
    FROM Marks
    WHERE marks > 80
);

SELECT subject, student_id, marks
FROM Marks m1
WHERE marks = (
    SELECT MAX(marks)
    FROM Marks m2
    WHERE m2.subject = m1.subject
);

SELECT student_id, subject, marks
FROM Marks
WHERE marks > (
    SELECT AVG(marks)
    FROM Marks
);

