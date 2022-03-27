echo "#Custom adding" >> /etc/hosts
echo "$(route -n | awk '/UG[ \t]/{print $2}')       localhost-core" >> /etc/hosts
echo "$(route -n | awk '/UG[ \t]/{print $2}')       localhost-ims" >> /etc/hosts
echo "$(route -n | awk '/UG[ \t]/{print $2}')       localhost-ims2" >> /etc/hosts
echo "$(route -n | awk '/UG[ \t]/{print $2}')       localhost-upload" >> /etc/hosts
