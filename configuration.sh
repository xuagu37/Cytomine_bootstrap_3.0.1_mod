#
# Copyright (c) 2009-2020. Authors: see NOTICE file.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

#URLs
CORE_URL=localhost-core
IMS_URL1=localhost-ims
IMS_URL2=localhost-ims2
UPLOAD_URL=localhost-upload

#Mail
ADMIN_EMAIL='info@cytomine.coop'
# SENDER_EMAIL, SENDER_EMAIL_PASS, SENDER_EMAIL_SMTP : email params of the sending account
SENDER_EMAIL_PASS='passwd'
SENDER_EMAIL_SMTP_HOST='smtp.gmail.com'
SENDER_EMAIL_SMTP_PORT='587'
SENDER_EMAIL='your.email@gmail.com'
# RECEIVER_EMAIL : email adress of the receiver
RECEIVER_EMAIL='receiver@XXX.com'

#Mail
ADMIN_EMAIL='info@cytomine.coop'

#Paths
CYCTOMINE_VERSION=3.0.1_mod
IMS_STORAGE_PATH=$HOME/Cytomine/Cytomine_bootstrap_$CYCTOMINE_VERSION/data/images
IMS_BUFFER_PATH=$HOME/Cytomine/Cytomine_bootstrap_$CYCTOMINE_VERSION/data/images/_buffer
BACKUP_PATH=$HOME/Cytomine/Cytomine_bootstrap_$CYCTOMINE_VERSION/data/backup
ALGO_PATH=$HOME/Cytomine/Cytomine_bootstrap_$CYCTOMINE_VERSION/data/algo
sudo rm -rf $IMS_STORAGE_PATH
sudo rm -rf $IMS_BUFFER_PATH
sudo rm -rf $BACKUP_PATH
sudo rm -rf $ALGO_PATH
mkdir -p $IMS_STORAGE_PATH
mkdir -p $IMS_BUFFER_PATH
mkdir -p $BACKUP_PATH
mkdir -p $ALGO_PATH

#middlewares
RABBITMQ_LOGIN="router"
RABBITMQ_PASSWORD="router"



# You don't have to change the datas below this line instead of advanced customization
# ---------------------------

NB_IIP_PROCESS=10

IIP_OFF_URL=localhost-iip-base
IIP_CYTO_URL=localhost-iip-cyto
IIP_JP2_URL=localhost-iip-jp2000

MEMCACHED_PASS="mypass"

BIOFORMAT_ENABLED=true
BIOFORMAT_ALIAS="bioformat"
BIOFORMAT_PORT="4321"



#keys
ADMIN_PWD=$(cat /proc/sys/kernel/random/uuid)
ADMIN_PUB_KEY=$(cat /proc/sys/kernel/random/uuid)
ADMIN_PRIV_KEY=$(cat /proc/sys/kernel/random/uuid)
SUPERADMIN_PUB_KEY=$(cat /proc/sys/kernel/random/uuid)
SUPERADMIN_PRIV_KEY=$(cat /proc/sys/kernel/random/uuid)
RABBITMQ_PUB_KEY=$(cat /proc/sys/kernel/random/uuid)
RABBITMQ_PRIV_KEY=$(cat /proc/sys/kernel/random/uuid)
IMS_PUB_KEY=$(cat /proc/sys/kernel/random/uuid)
IMS_PRIV_KEY=$(cat /proc/sys/kernel/random/uuid)
SERVER_ID=$(cat /proc/sys/kernel/random/uuid)
