# Template service

    @GET("/example/helloWorld")

## Endpoints

### /example/helloWorld

---

#### ***GET***

**Description:** Gets the `Greetings` objects.

**Parameters**

| Name | Located in | Description | Required | Schema |
| ---- | ---------- | ----------- | -------- | ---- |
| n/a | path | ID of requested greeting | Yes | string |

**Responses**

| Code | Description | Schema |
| ---- | ----------- | ------ |
| 200 | Successful response | [HelloJson](#HelloJson) |

## Models

### HelloJson
| Name | Type | Description | Required |
| ---- | ---- | ----------- | -------- |
| helloString | string | The greeting in plain text | Yes |
