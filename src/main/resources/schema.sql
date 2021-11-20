DROP TABLE IF EXISTS job_data;

CREATE TABLE `job_data` (
                            `job_id` int NOT NULL AUTO_INCREMENT,
                            `job_name` varchar(30) NOT NULL,
                            `company_name` varchar(30) NOT NULL,
                            `job_link` varchar(50) NOT NULL,
                            `applied_date` date NOT NULL,
                            `app_status` varchar(25) NOT NULL,
                            PRIMARY KEY (`job_id`)
);
