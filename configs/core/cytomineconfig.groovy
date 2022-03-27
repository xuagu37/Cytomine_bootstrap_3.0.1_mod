dataSource.url='jdbc:postgresql://postgresql:5432/docker'
dataSource.username='docker'
dataSource.password='docker'

cytomine.customUI.global = [
        dashboard: ["ALL"],
        search : ["ROLE_ADMIN"],
        project: ["ALL"],
        ontology: ["ROLE_ADMIN"],
        storage : ["ROLE_USER","ROLE_ADMIN"],
        activity : ["ALL"],
        feedback : ["ROLE_USER","ROLE_ADMIN"],
        explore : ["ROLE_USER","ROLE_ADMIN"],
        admin : ["ROLE_ADMIN"],
        help : ["ALL"]
]


grails.serverURL='http://localhost-core'
grails.imageServerURL=['http://localhost-ims','http://localhost-ims2']
grails.uploadURL='http://localhost-upload'

storage_buffer='/home/xuagu37/Cytomine/Cytomine_bootstrap_3.0.1_mod/data/images/_buffer'
storage_path='/home/xuagu37/Cytomine/Cytomine_bootstrap_3.0.1_mod/data/images'

grails.adminPassword='b1b3201d-6954-4694-bea8-48bd15158e18'
grails.adminPrivateKey='1804ec4d-f18f-4c2f-9195-d8580569a7b7'
grails.adminPublicKey='6d58ba78-69a1-4149-8633-f7892018ef79'
grails.superAdminPrivateKey='e77f0981-db06-49c2-a19b-df492aca8e54'
grails.superAdminPublicKey='a3696a74-2f72-4e5e-b858-f538682dedd8'
grails.ImageServerPrivateKey='b6e147de-300e-470c-89d9-a96f7e64f357'
grails.ImageServerPublicKey='aede6c0d-4aa8-488a-ad1d-7149c775b655'
grails.rabbitMQPrivateKey='3a789410-77ab-4901-8d83-c0dfbe584c2a'
grails.rabbitMQPublicKey='9b5f07ca-1053-41db-aa24-da300f855e69'

grails.notification.email='your.email@gmail.com'
grails.notification.password='passwd'
grails.notification.smtp.host='smtp.gmail.com'
grails.notification.smtp.port='587'
grails.admin.email='info@cytomine.coop'

grails.mongo.host = 'mongodb'
grails.mongo.options.connectionsPerHost=10
grails.mongo.options.threadsAllowedToBlockForConnectionMultiplier=5

grails.messageBrokerServerURL='rabbitmq:5672'

grails.serverID='0693d00f-2660-4df2-a64e-681f90ee98c7'
