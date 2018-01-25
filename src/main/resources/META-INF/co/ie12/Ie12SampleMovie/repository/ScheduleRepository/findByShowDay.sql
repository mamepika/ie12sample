SELECT
   sc.scheduleId,
   mov.title,
   mov.director,
   sc.showDay,
   sc.startTime,
   sc.endTime,
   sc.theaterId
FROM
   schedules sc,movies mov
WHERE
   sc.movieId = mov.movieid
AND
   sc.showDay = /* date */'2018-01-26';