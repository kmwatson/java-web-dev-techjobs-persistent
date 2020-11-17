## Part 1: Test it with SQL
id INT
employer VARCHAR
name VARCHAR
skills VARCHAR

## Part 2: Test it with SQL
SELECT *
FROM jobs
WHERE location

## Part 3: Test it with SQL
DROP TABLE 'techjobs'.'jobs'

## Part 4: Test it with SQL
SELECT name, description
FROM skill
INNER JOIN job ON skill.id = job_skills.id
ORDER BY name ASC
