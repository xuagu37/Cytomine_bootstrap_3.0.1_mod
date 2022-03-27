rabbitmq.host = "rabbitmq"
rabbitmq.port = "5672"
rabbitmq.username='router'
rabbitmq.password='router'

cytomine.core.url='http://localhost-core'
cytomine.core.publicKey='9b5f07ca-1053-41db-aa24-da300f855e69'
cytomine.core.privateKey='3a789410-77ab-4901-8d83-c0dfbe584c2a'

cytomine.software.communication.exchange = "exchangeCommunication"
cytomine.software.communication.queue = "queueCommunication"

cytomine.software.path.softwareSources='/data/softwares/code'
cytomine.software.path.softwareImages='/data/softwares/images'
cytomine.software.path.jobs='/data/jobs'
cytomine.software.sshKeysFile='/root/.ssh/id_rsa'
cytomine.software.descriptorFile = "descriptor.json"

cytomine.software.ssh.maxRetries = 3
// In seconds
cytomine.software.repositoryManagerRefreshRate = 300
