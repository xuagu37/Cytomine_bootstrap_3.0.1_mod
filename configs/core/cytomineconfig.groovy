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

storage_buffer='/data/images/_buffer'
storage_path='/data/images'

grails.adminPassword='8e0d7fe7-beb6-44a4-8f5a-c112d44e771f'
grails.adminPrivateKey='be0db9e0-78d2-4fbf-8455-baf9bb8b7882'
grails.adminPublicKey='30323ff2-0dd7-4157-a42b-423c6e1f62f5'
grails.superAdminPrivateKey='cb30ac60-fd67-446f-9edb-bd8aa8938eaf'
grails.superAdminPublicKey='8ed23d86-a69c-440b-af30-bbccf1c8fbec'
grails.ImageServerPrivateKey='7c27b6d5-8e77-4cd3-aa8c-4ada04f6bc56'
grails.ImageServerPublicKey='2a61d5c6-18e8-4893-a6e3-b7e8a2600164'
grails.rabbitMQPrivateKey='ccb7b6bd-b593-400e-bcf5-6699b6fd3938'
grails.rabbitMQPublicKey='348d0f66-0213-44bf-a180-b17cecce03cb'

grails.notification.email='your.email@gmail.com'
grails.notification.password='passwd'
grails.notification.smtp.host='smtp.gmail.com'
grails.notification.smtp.port='587'
grails.admin.email='info@cytomine.coop'

grails.mongo.host = 'mongodb'
grails.mongo.options.connectionsPerHost=10
grails.mongo.options.threadsAllowedToBlockForConnectionMultiplier=5

grails.messageBrokerServerURL='rabbitmq:5672'

grails.serverID='e7180e39-7803-4404-badb-a32149aa3da9'
