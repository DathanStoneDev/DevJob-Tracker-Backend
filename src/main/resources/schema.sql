DROP TABLE IF EXISTS job_data;

CREATE TABLE `job_data` (
                            `job_id` int NOT NULL AUTO_INCREMENT,
                            `job_name` varchar(30) NOT NULL,
                            `company_name` varchar(30) NOT NULL,
                            `job_link` varchar(50) NOT NULL,
                            `applied_date` date NOT NULL,
                            `waiting_response` tinyint(1) NOT NULL DEFAULT '1',
                            `got_interview` tinyint(1) NOT NULL DEFAULT '0',
                            `rejected` tinyint(1) NOT NULL DEFAULT '0',
                            `received_offer` tinyint(1) NOT NULL DEFAULT '0',
                            PRIMARY KEY (`job_id`)
);
