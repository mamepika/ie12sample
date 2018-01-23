create table Movies (
  MovieId serial
  , title character varying(256)
  , director character varying(64)
  , runnningTime character varying(4)
  , constraint Movies_PKC primary key (MovieId)
) ;

