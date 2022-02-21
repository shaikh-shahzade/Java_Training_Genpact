
UPDATE Trainer_Info 
SET Trainer_Password = 'nn4@123'
where Trainer_Id = 'F004' ;

select * from Trainer_Info
where Trainer_Id = 'F004' ;


DELETE FROM Associate_Status
WHERE Associate_Id = 'A003'
AND Module_Id='J2EE' 
AND Batch_Id = 'B004'
AND Trainer_Id = 'F004'
AND Start_Date = '2005-12-1'
AND End_Date = '2005-12-25';


select  * from Trainer_Info 
order by Trainer_Experiance desc  
LIMIT 5;

