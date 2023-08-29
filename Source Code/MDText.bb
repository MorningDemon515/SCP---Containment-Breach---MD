
;Include "Source Code\BlitzEncode.bb"

Function Text(x%, y%, txt$, xPos% = 0, yPos% = 0, a# = 1.0 )
	Local oldr% = ColorRed() : Local oldg% = ColorGreen() : Local oldb% = ColorBlue()
	Color oldr*a,oldg*a,oldb*a
	Blitz_Text x,y,txt,xPos,yPos
	Color oldr,oldg,oldb
	Return 
End Function

Function MDSetFont(Font%)
	;ConvertEncoding(txt$, UTF8, GetCodePage())
End Function

Function MDLoadFont%(file$,height)
	Return 
End Function

Function MDStringHeight%(txt$)
	Return ;ConvertEncoding(txt$, UTF8, GetCodePage())
End Function

Function MDStringWidth%(txt$)
	Return ;ConvertEncoding(txt$, UTF8, GetCodePage())
End Function

;Function Text(x%, y%, txt$, xPos% = 0, yPos% = 0, a# = 1.0)
	;Local oldr% = ColorRed() : Local oldg% = ColorGreen() : Local oldb% = ColorBlue()
	;Color oldr*a,oldg*a,oldb*a
	;Blitz_Text x,y,txt,xPos,yPos
	;Color oldr,oldg,oldb
	;Return 
;End Function

;Function CATU$(txt$)
	;Return ConvertEncoding(txt$, GetCodePage(), UTF8)
;End Function

;Function CUTA$(txt$)
	;Return ConvertEncoding(txt$, UTF8, GetCodePage())
;End Function
;~IDEal Editor Parameters:
;~C#Blitz3D