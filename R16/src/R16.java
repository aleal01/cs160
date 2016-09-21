// R16 Assignment
// Author: Aaron Leal
// Date:   Nov 10, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
public class R16 implements RecitationInterface {
	PictureLibrary pl = null;
	int width = 0;
	int height = 0;
	int[][] iArray;
	
	public R16(){
        pl = new PictureLibrary();
    }
	
	@Override
	public void readImage(String inFile) {
		try {
			pl.readPGM(inFile);
			width = pl.getWidth();
			height = pl.getHeight();
			iArray = pl.getData();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void writeImage(String outFile) {
		try {
			pl.setData(iArray);
			pl.writePGM(outFile);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public int[][] imageData() {
		return iArray;
	}

	@Override
	public void negateImage() {
		for (int i = 0; i < height; i++){
			for (int j = 0; j < width; j ++){
				iArray[i][j] = pl.MAXVAL - iArray[i][j];
			}
		}
		
	}

	@Override
	public void increaseContrast() {
		for (int i = 0; i < height; i++){
			for (int j = 0; j < width; j ++){
				if (iArray[i][j] <= 127 && iArray[i][j] >= 0){
					iArray[i][j] = iArray[i][j] - 16;
			}
				if (iArray[i][j] <= pl.MAXVAL && iArray[i][j] > 127){
					iArray[i][j] = iArray[i][j] +16;
				}
				if (iArray[i][j] > pl.MAXVAL){
					iArray[i][j] = pl.MAXVAL;
				}
				if (iArray[i][j] < 0){
					iArray[i][j] = 0;
				}
				
		}
		
	}
		
	}

	@Override
	public void decreaseContrast() {
		for (int i = 0; i < height; i++){
			for (int j = 0; j < width; j ++){
				if (iArray[i][j] <= 127 && iArray[i][j] >= 0){
					iArray[i][j] = iArray[i][j] + 16;
			}
				if (iArray[i][j] <= pl.MAXVAL && iArray[i][j] > 127 ){
					iArray[i][j] = iArray[i][j] - 16;
				}
				
		}
		
	}
		
	}

}
