-- https://www.hackerrank.com/challenges/weather-observation-station-13/problem

SELECT TRUNCATE(SUM(lat_n), 4)
FROM station
WHERE lat_n BETWEEN 38.7880 AND 137.2345;
