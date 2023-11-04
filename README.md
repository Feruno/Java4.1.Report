# Скриншоты 
1. Скриншот успешного теста
   ![Снимок экрана 2023-09-24 202443](https://github.com/Feruno/Java4.1.Report/assets/60847105/87129747-18a4-4e4a-a6dc-6d1fe0e3c541)
   
1. Скриншот упавшего теста
   ![Снимок экрана 2023-09-24 202705](https://github.com/Feruno/Java4.1.Report/assets/60847105/96494494-d38a-48fa-a555-df732e61f2de)
   ![Снимок экрана 2023-09-24 202741](https://github.com/Feruno/Java4.1.Report/assets/60847105/4c69155e-9068-4a66-9f41-a461250054f4)
   ![Снимок экрана 2023-09-24 203550](https://github.com/Feruno/Java4.1.Report/assets/60847105/2d505d41-b1c0-42c3-955e-836d001c85d9)
   
1. Скриншот неправильного теста
   ![Снимок экрана 2023-09-24 202908](https://github.com/Feruno/Java4.1.Report/assets/60847105/28c6c3c0-fb69-4394-90b1-261a0cc5231b)
   ![Снимок экрана 2023-09-24 202930](https://github.com/Feruno/Java4.1.Report/assets/60847105/b5854881-6872-47c2-baff-b94948669595)


 
 # Задача №2: Report Portal
 Подключение и настройка Report Portal.
 1. Для работы с Report Portal должен быть установлен docker.
 1. Файл docker-compose.yml должен сожерать следуюшие [наполнение](https://github.com/reportportal/reportportal/blob/master/docker-compose.yml).
 1. Раскоментируйте строки для вашей ОС ![image](https://github.com/Feruno/Java4.1.Report/assets/60847105/3dcecf52-ad63-4262-a482-9d4ed4572e75)
 
 1. В проекте в папке "resources" нужны следующие файлы: log4j2.xml [содержимое для файла тут](https://github.com/reportportal/agent-java-junit5#readme) , logback.xml [содержимое для файла тут](https://github.com/reportportal/agent-java-junit).
 1. В проекте в папке "resources" нужна следующая директория и файл: META-INF\services с файлом org.junit.jupiter.api.extension.Extension и содержимое в нем  com.epam.reportportal.junit5.ReportPortalExtension.
 1. Для настройки файла reportportal.properties нужно взять данные в запущенном репорт портале в профиле ползователя в разделе "configExamples" ![image](https://github.com/Feruno/Java4.1.Report/assets/60847105/3911d07a-1a78-4840-940d-97c4ac8ad2c6)
 1. Для настройки файла reportportal.properties вам так же нужно сгенирировать api ключ, в профиле пользователя ![image](https://github.com/Feruno/Java4.1.Report/assets/60847105/b358b076-f84d-48c0-8fd1-3894b9e92326).
 1. Так должна выглядеть папка "resources" ![image](https://github.com/Feruno/Java4.1.Report/assets/60847105/475bd35b-cece-4082-8dc0-e006e32da3af).
 1. После запуска авто тестов в IDE во вкладке "launches" (в reportportal) должны появиться результаты прогона ваших тестов. ![image](https://github.com/Feruno/Java4.1.Report/assets/60847105/17f40144-bf23-4129-8df5-870efa1a18ec)

 

