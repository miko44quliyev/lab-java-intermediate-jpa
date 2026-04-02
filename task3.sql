
SELECT * FROM tasks
WHERE due_date < NOW() - INTERVAL 7 DAY;

UPDATE tasks
SET status = false
ORDER BY due_date
LIMIT 10;

DELETE FROM tasks
WHERE status = true
ORDER BY due_date
LIMIT 5;