#!/bin/bash
curl --request GET \
  --url 'https://api.ibm.com/mapinsights/eventservice/event/allevents?tenant_id=78d20ed9-572c-4e8b-a1fc-ce52dd3a5e39' \
  --header 'accept: application/json' \
  --header 'content-type: application/json'
           #'&num_rec_in_page=10'\
           #'$num_page=1'\
