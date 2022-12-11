function fileReader(FILE_ELEMENT, CALLBACK)
{
    const reader=new FileReader();
    reader.onload=function(){
        cancelIdleCallback(reader.result);
    }
    reader.readAsText(FILE_ELEMENT.files[0], "EUC-KR");
}