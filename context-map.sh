#!/bin/bash
curl --request POST \
  --url 'https://api.ibm.com/mapinsights/eventservice/event?tenant_id=78d20ed9-572c-4e8b-a1fc-ce52dd3a5e39' \
  --header 'accept: application/json' \
  --header 'content-type: application/json'

# lat: 29.55 
# long: 90.0715
# 29.9511° N, 90.0715° W (lat)
# 30.4583° N, 91.1403° W (lat)
# s_latitude(double): Latitude of the start point, which is specified in the WGS84 coordinate system.
# s_longitude(double): Longitude of the start point, which is specified in the WGS84 coordinate system.
# event_type(string): User-defined type of the event.
#
